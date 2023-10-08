package com.example.sincopossystemv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InventoryActivity extends AppCompatActivity {

    //number of selected tabs
    private int SelectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        // Set the orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Initialize your layout and view variables here
        final LinearLayout HomeLayout = findViewById(R.id.HomeLayout);
        final LinearLayout ProductsLayout = findViewById(R.id.ProductsLayout);
        final LinearLayout SalesReportLayout = findViewById(R.id.SalesandReportsLayout);
        final LinearLayout InventoryLayout = findViewById(R.id.InventoryLayout);
        final LinearLayout SettingsLayout = findViewById(R.id.SettingsLayout);
        final LinearLayout LogoutLayout = findViewById(R.id.LogoutLayout);

        final ImageView HomeImage = findViewById(R.id.HomeImage);
        final ImageView ProductsImage = findViewById(R.id.ProductsImage);
        final ImageView SalesReportImage = findViewById(R.id.SalesandReportsImage);
        final ImageView InventoryImage = findViewById(R.id.InventoryImage);
        final ImageView SettingsImage = findViewById(R.id.SettingsImage);
        final ImageView LogoutImage = findViewById(R.id.LogoutImage);

        final TextView HomeText = findViewById(R.id.Hometxt);
        final TextView ProductsText = findViewById(R.id.Productstxt);
        final TextView SalesReportText = findViewById(R.id.SalesandReportstxt);
        final TextView InventoryText = findViewById(R.id.Inventorytxt);
        final TextView SettingsText = findViewById(R.id.Settingstxt);
        final TextView LogoutText = findViewById(R.id.Logouttxt);


        HomeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if the tab is selected
                if (SelectedTab != 1) {

                    ProductsText.setVisibility(View.GONE);
                    SalesReportText.setVisibility(View.GONE);
                    InventoryText.setVisibility(View.GONE);
                    SettingsText.setVisibility(View.GONE);
                    LogoutText.setVisibility(View.GONE);

                    // unselect other tabs except home tab
                    ProductsImage.setImageResource(R.drawable.products);
                    SalesReportImage.setImageResource(R.drawable.salesreport);
                    InventoryImage.setImageResource(R.drawable.inventory);
                    SettingsImage.setImageResource(R.drawable.settings);
                    LogoutImage.setImageResource(R.drawable.logout);

                    ProductsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SalesReportImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    InventoryImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SettingsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    LogoutImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //select home tab
                    HomeText.setVisibility(View.VISIBLE);
                    HomeImage.setImageResource(R.drawable.homeselected);
                    HomeImage.setBackgroundResource(R.drawable.round_sidenavbar);


                    // Define the scale animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(
                            0.8f, 1.0f,  // Start and end scale X
                            1f, 1f,  // Start and end scale Y
                            Animation.RELATIVE_TO_SELF, 0.0f,  // Pivot point X (center)
                            Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF   // Pivot point Y (center)
                    );

                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    HomeLayout.startAnimation(scaleAnimation);

                    // set 1st tab as selected tab
                    SelectedTab = 1;


                }
                startActivity(new Intent(InventoryActivity.this, HomeActivity.class));
            }
        });

        ProductsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if the tab is selected
                if (SelectedTab != 2) {

                    HomeText.setVisibility(View.GONE);
                    SalesReportText.setVisibility(View.GONE);
                    InventoryText.setVisibility(View.GONE);
                    SettingsText.setVisibility(View.GONE);
                    LogoutText.setVisibility(View.GONE);

                    // unselect other tabs except products tab
                    HomeImage.setImageResource(R.drawable.home);
                    SalesReportImage.setImageResource(R.drawable.salesreport);
                    InventoryImage.setImageResource(R.drawable.inventory);
                    SettingsImage.setImageResource(R.drawable.settings);
                    LogoutImage.setImageResource(R.drawable.logout);

                    HomeImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SalesReportImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    InventoryImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SettingsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    LogoutImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //select product tab
                    ProductsText.setVisibility(View.VISIBLE);
                    ProductsImage.setImageResource(R.drawable.productsselected);
                    ProductsImage.setBackgroundResource(R.drawable.round_sidenavbar);


                    // Define the scale animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(
                            0.8f, 1.0f,  // Start and end scale X
                            1f, 1f,  // Start and end scale Y
                            Animation.RELATIVE_TO_SELF, 0.0f,  // Pivot point X (center)
                            Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF   // Pivot point Y (center)
                    );

                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    ProductsLayout.startAnimation(scaleAnimation);

                    // set 2nd tab as selected tab
                    SelectedTab = 2;

                }
                startActivity(new Intent(InventoryActivity.this, ProductsActivity.class));
            }
        });

        SalesReportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if the Salesandreport is selected
                if (SelectedTab != 3) {


                    HomeText.setVisibility(View.GONE);
                    ProductsText.setVisibility(View.GONE);
                    InventoryText.setVisibility(View.GONE);
                    SettingsText.setVisibility(View.GONE);
                    LogoutText.setVisibility(View.GONE);

                    HomeImage.setImageResource(R.drawable.home);
                    ProductsImage.setImageResource(R.drawable.products);
                    InventoryImage.setImageResource(R.drawable.inventory);
                    SettingsImage.setImageResource(R.drawable.settings);
                    LogoutImage.setImageResource(R.drawable.logout);

                    HomeImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ProductsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    InventoryImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SettingsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    LogoutImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //select Sales tab
                    SalesReportText.setVisibility(View.VISIBLE);
                    SalesReportImage.setImageResource(R.drawable.salesreportselected);
                    SalesReportImage.setBackgroundResource(R.drawable.round_sidenavbar);


                    // Define the scale animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(
                            0.8f, 1.0f,  // Start and end scale X
                            1f, 1f,  // Start and end scale Y
                            Animation.RELATIVE_TO_SELF, 0.0f,  // Pivot point X (center)
                            Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF   // Pivot point Y (center)
                    );

                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    SalesReportLayout.startAnimation(scaleAnimation);

                    // set 3rd tab as selected tab
                    SelectedTab = 3;
                }
                startActivity(new Intent(InventoryActivity.this, SalesReportActivity.class));
            }
        });

        InventoryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if the Inventory is selected
                if (SelectedTab != 4) {


                    HomeText.setVisibility(View.GONE);
                    ProductsText.setVisibility(View.GONE);
                    SalesReportText.setVisibility(View.GONE);
                    SettingsText.setVisibility(View.GONE);
                    LogoutText.setVisibility(View.GONE);

                    // unselect other tabs except products tab
                    HomeImage.setImageResource(R.drawable.home);
                    ProductsImage.setImageResource(R.drawable.products);
                    SalesReportImage.setImageResource(R.drawable.salesreport);
                    SettingsImage.setImageResource(R.drawable.settings);
                    LogoutImage.setImageResource(R.drawable.logout);

                    HomeImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ProductsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SalesReportImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SettingsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    LogoutImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //select Inventory tab
                    InventoryText.setVisibility(View.VISIBLE);
                    InventoryImage.setImageResource(R.drawable.inventoryselected);
                    InventoryImage.setBackgroundResource(R.drawable.round_sidenavbar);


                    // Define the scale animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(
                            0.8f, 1.0f,  // Start and end scale X
                            1f, 1f,  // Start and end scale Y
                            Animation.RELATIVE_TO_SELF, 0.0f,  // Pivot point X (center)
                            Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF   // Pivot point Y (center)
                    );

                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    InventoryLayout.startAnimation(scaleAnimation);

                    // set 4th tab as selected tab
                    SelectedTab = 4;
                }

                startActivity(new Intent(InventoryActivity.this, InventoryActivity.class));
            }
        });

        SettingsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if the Settings is selected
                if (SelectedTab != 5) {


                    HomeText.setVisibility(View.GONE);
                    ProductsText.setVisibility(View.GONE);
                    SalesReportText.setVisibility(View.GONE);
                    InventoryText.setVisibility(View.GONE);
                    LogoutText.setVisibility(View.GONE);

                    // unselect other tabs except products tab
                    HomeImage.setImageResource(R.drawable.home);
                    ProductsImage.setImageResource(R.drawable.products);
                    SalesReportImage.setImageResource(R.drawable.salesreport);
                    InventoryImage.setImageResource(R.drawable.inventory);
                    LogoutImage.setImageResource(R.drawable.logout);

                    HomeImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ProductsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SalesReportImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    InventoryImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    LogoutImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //select Settings tab
                    SettingsText.setVisibility(View.VISIBLE);
                    SettingsImage.setImageResource(R.drawable.settingsselected);
                    SettingsImage.setBackgroundResource(R.drawable.round_sidenavbar);


                    // Define the scale animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(
                            0.8f, 1.0f,  // Start and end scale X
                            1f, 1f,  // Start and end scale Y
                            Animation.RELATIVE_TO_SELF, 0.0f,  // Pivot point X (center)
                            Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF   // Pivot point Y (center)
                    );

                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    SettingsLayout.startAnimation(scaleAnimation);

                    // set 5th tab as selected tab
                    SelectedTab = 5;
                }

                startActivity(new Intent(InventoryActivity.this, SettingsActivity.class));
            }
        });

        LogoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if the logout is selected
                if (SelectedTab != 6) {


                    HomeText.setVisibility(View.GONE);
                    ProductsText.setVisibility(View.GONE);
                    SalesReportText.setVisibility(View.GONE);
                    SettingsText.setVisibility(View.GONE);
                    InventoryText.setVisibility(View.GONE);

                    // unselect other tabs except products tab
                    HomeImage.setImageResource(R.drawable.home);
                    ProductsImage.setImageResource(R.drawable.products);
                    SalesReportImage.setImageResource(R.drawable.salesreport);
                    SettingsImage.setImageResource(R.drawable.settings);
                    InventoryImage.setImageResource(R.drawable.inventory);

                    HomeImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ProductsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SalesReportImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    InventoryImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    SettingsImage.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                    //select Settings tab
                    LogoutText.setVisibility(View.VISIBLE);
                    LogoutImage.setImageResource(R.drawable.logoutselected);
                    LogoutImage.setBackgroundResource(R.drawable.round_sidenavbar);


                    // Define the scale animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(
                            0.8f, 1.0f,  // Start and end scale X
                            1f, 1f,  // Start and end scale Y
                            Animation.RELATIVE_TO_SELF, 0.0f,  // Pivot point X (center)
                            Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF   // Pivot point Y (center)
                    );

                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    LogoutLayout.startAnimation(scaleAnimation);

                    // set 6th tab as selected tab
                    SelectedTab = 6;
                }
                startActivity(new Intent(InventoryActivity.this, LogoutActivity.class));
            }

        });
    }
}

