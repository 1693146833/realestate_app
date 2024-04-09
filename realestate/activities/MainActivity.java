package com.example.realestate.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realestate.Adapter.ItemsAdapter;
import com.example.realestate.Domain.ItemsDmain;
import com.example.realestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<ItemsDmain> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new ItemsDmain("享有美景的房子", "联系密切的老业主出售，生活区域变动，再次置换改善，诚信靠谱卖房，周期付款都可以在沟通，还有议价空间，具体可以见面详聊，满五唯一无个税，购房成本少，适合首套刚需或者改善自住，好楼层既保证上下楼方便，又保证回家有个温暖窝。", "散料使,Ca 94110", 84123, 2, 1, "pic1", true));
        itemsArrayList.add(new ItemsDmain("离学校近的校区房", "A类好户型，户型方正无浪费面积，南北通透性格局，其中客厅朝南带一个生活阳台，晾晒衣服，养一些花生活惬意舒适，楼前也是矮层，无遮挡，三个卧室都很方正较大主卧室18.7平左右，最小的卧室15.7平，居住舒适度高。", "san francisco,Ca 94110", 84123, 2, 2, "pic2", false));
        itemsArrayList.add(new ItemsDmain("美丽的房子", "来看看吧，如果你有时间想来看看，给我打电话即可", "弗吕特,Ca 94110", 2284123, 3, 1, "pic1", true));

        RecyclerView recyclerViewNew = requireViewById(R.id.viewPopular);
        RecyclerView recyclerViewPopular = requireViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> adapterNew = new ItemsAdapter(itemsArrayList);
        RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> adapterPopular = new ItemsAdapter(itemsArrayList);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}
