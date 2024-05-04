package com.example.mynotestack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MyPublicActivity extends AppCompatActivity {


    RecyclerView recView;
    PublicAdapter pubAda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_public);
        recView = findViewById(R.id.recycler_view2);

        pubAda = new PublicAdapter(getPublicData(),this);
        recView.setAdapter(pubAda);
        //recView.setLayoutManager(new LinearLayoutManager(this));
        //recView.setLayoutManager(new GridLayoutManager(this,2));
        recView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
    }


    public void onBackPressed()
    {
        super.onBackPressed();
    }



    // Sample data for RecyclerView
    private List<DataDetail> getPublicData()
    {
        List<DataDetail> list = new ArrayList<>();
        list.add(new DataDetail("Hanukkah",
                        "Hanukkah is a Jewish festival that is celebrated for eight days, usually in December. It is also called the Festival of Lights. Find out why and learn about what people do to celebrate this special holiday."));
        list.add(new DataDetail("Modern-day slavery",
                "December 2 is the United Nation's International Day for the Abolition of Slavery. Did you know that slavery still exists today and is probably much closer to you than you realise?"));
        list.add(new DataDetail("Black Friday and Buy Nothing Day",
                "Every year in November, people look for bargains on Black Friday. But did you know that the same day is also Buy Nothing Day?"));
        list.add(new DataDetail("Thanksgiving",
                "Every autumn, "));
        list.add(new DataDetail("Universal Children's Day",
                "Children all around the world need adults to help, rn how we can help the youngest, most vulnerable members of our communities."));
        list.add(new DataDetail("World Kindness Day",
                "World Kindness Day is celebrated on 13 November. How can we become happier by doing kind things for others? "));
        list.add(new DataDetail("Diwali",
                "Diwali is a festival of light which originated in South Asia and is celebrated over five days.  The dates change every year, but it is always celebrated in Oh Asia and is celebrated over five days. The dates change every year, but it is always celebrated in Oh Asia and is celebrated over five days. The dates change every year, but it is always celebrated in Oh Asia and is celebrated over five days. The dates change every year, but it is always celebrated in Oh Asia and is celebrated over five days. The dates change every year, but it is always celebrated in Oh Asia and is celebrated over five days. The dates change every year, but it is always celebrated in Oh Asia and is celebrated over five days. The dates change every year, but it is always celebrated in October or November and is now celebrated around the world."));
        list.add(new DataDetail("Bonfire Night",
                "If you’re ever in the UK on the evening of 5 November, you might wonder why you can hear fireworks. Bonfire Night is celebrated all over the country, but what is it about? Find out about the history of this well-loved event in this article."));
        list.add(new DataDetail("Veganism",
                "Vegans argue that animal farming is not only cruel but also bad for the environment. World Vegan Day, on 1 November, puts the focus on the vegan way of life."));
        return list;
    }




    public class DataDetail{
        String name;
        String bio;
        DataDetail(String name,String bio){
            this.name = name;
            this.bio = bio;
        }
    }
}



