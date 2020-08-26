package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductAdapter.IOnClickItem {

    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        ProductAdapter adapter = new ProductAdapter(this, listProduct, this);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        RecyclerView rvProduct = (RecyclerView) findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }

    private void initData(){
        listProduct.add(new Product("Zara P1","Love Shift 1","1100.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P2","Love Shift 2","1200.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P3","Love Shift 3","1300.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P4","Love Shift 4","1400.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P5","Love Shift 5","1500.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P6","Love Shift 6","1600.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P7","Love Shift 7","1700.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P8","Love Shift 8","1800.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P9","Love Shift 9","1900.000",R.drawable.ic_launcher_background));
        listProduct.add(new Product("Zara P10","Love Shift 10","1000.000",R.drawable.ic_launcher_background));

    }
    @Override
    public void onClickItem(int position){
        Product product = listProduct.get(position);
        Toast.makeText(this, product.getTitle(),Toast.LENGTH_SHORT).show();
    }
}