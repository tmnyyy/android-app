package com.itstep.sixapplication.ex_014_expandable_list_view;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;


import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class MainActivity extends Activity {

    private List<Car> cars;
    private Set<String> markSet;

    // коллекция для групп
    private List<Map<String, String>> groupData;

    // общая коллекция для коллекций элементов
    private List<List<Map<String, String>>> childData;
    // в итоге получится childData = ArrayList<childDataItem>

    // список атрибутов группы или элемента
    private Map<String, String> currentMap;

    private ExpandableListView expandableListView;


    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_014_main_layout);

        initList();
        initSet();
        // заполняем коллекцию групп из массива с названиями групп
        groupData = new ArrayList<Map<String, String>>();

        for (String group : markSet) {
            // заполняем список атрибутов для каждой группы
            currentMap = new HashMap<String, String>();
            currentMap.put("groupName", group); // имя компании
            groupData.add(currentMap);
        }

        // список атрибутов групп для чтения
        String[] groupFrom = new String[] {"groupName"};
        // список ID view-элементов, в которые будет помещены атрибуты групп
        int[] groupTo = new int[] {android.R.id.text1};


        // создаем коллекцию для коллекций элементов
        childData = initChildData();

        // список атрибутов элементов для чтения
        String[] childFrom = new String[] { "carName" };
        // список ID view-элементов, в которые будет помещены атрибуты элементов
        int[] childTo = new int[] {android.R.id.text1};

        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(
                this,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                groupFrom,
                groupTo,
                childData,
                android.R.layout.simple_list_item_1,
                childFrom,
                childTo);

        expandableListView = (ExpandableListView) findViewById(R.id.expandeble_list);
        expandableListView.setAdapter(adapter);
    }

    private List<List<Map<String, String>>> initChildData() {
        List<List<Map<String, String>>> childData = new ArrayList<>();

        // заполняем список атрибутов для каждого элемента
        for (String mark : markSet) {

            List<Map<String, String>> childDataItem = new ArrayList<>();

            for (Car car : cars) {
                if (car.getMark().equals(mark)) {
                    Map<String, String> modelMap = new HashMap<>();
                    modelMap.put("carName", car.getModel());
                    childDataItem.add(modelMap);
                }
            }
            childData.add(childDataItem);
        }

        return childData;
    }

    private void initList() {
        cars = new ArrayList<>();
        cars.add(new Car("Porsche", "Panamera turbo"));
        cars.add(new Car("Porsche", "Cayenne S"));
        cars.add(new Car("Maseratti", "Quattroporte"));
        cars.add(new Car("Audi", "A5"));
        cars.add(new Car("Audi", "R8"));
        cars.add(new Car("BMW", "X5"));
        cars.add(new Car("BMW", "M3"));
        cars.add(new Car("BMW", "750Li"));
    }

    private void initSet() {
        markSet = new TreeSet<>();

        for (Car car : cars) {
            markSet.add(car.getMark());
        }

    }

}
