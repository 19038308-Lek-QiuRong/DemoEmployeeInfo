package sg.edu.rp.c346.id19036308.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;
    ArrayList<EmployeeInfo> employeeInfoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.listViewEmployeeInfo);
        employeeInfoList = new ArrayList();
        EmployeeInfo av1 = new EmployeeInfo("John", "Software Technical Leader", 3400.0);
        employeeInfoList.add(av1);
        employeeInfoList.add(new EmployeeInfo("May", "Programmer", 2200.0));

        adapter = new CustomAdapter(this, R.layout.row, employeeInfoList);
        lvEmployeeInfo.setAdapter(adapter);
    }
}
