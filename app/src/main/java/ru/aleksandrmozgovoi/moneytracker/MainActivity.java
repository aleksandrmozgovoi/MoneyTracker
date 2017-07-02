package ru.aleksandrmozgovoi.moneytracker;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        final ViewPager pages = (ViewPager) findViewById(R.id.pages);
        pages.setAdapter(new MainPagerAdapter());
        tabs.setupWithViewPager(pages);
    }

    private class MainPagerAdapter extends FragmentPagerAdapter {
        private final String[] titles;

        MainPagerAdapter() {
            super(getSupportFragmentManager());
            titles = getResources().getStringArray(R.array.main_pager_titles);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                /**Вкладка расходов*/
                case 0:
                    ItemsFragment fragment = new ItemsFragment();
                    Bundle args = new Bundle();
                    args.putString(ItemsFragment.ARG_TYPE, Item.TYPE_EXPENSE);
                    fragment.setArguments(args);
                    return fragment;
                /**Вкладка доходов*/
                case 1:
                    fragment = new ItemsFragment();
                    args = new Bundle();
                    args.putString(ItemsFragment.ARG_TYPE, Item.TYPE_INCOME);
                    fragment.setArguments(args);
                    return fragment;
                /**Вкладка баланса*/
                case 2:
                    BalanceFragment balanceFragment = new BalanceFragment();
                    return balanceFragment;
                default:
                    return fragment = new ItemsFragment();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public int getCount() {
            return titles.length;
        }
    }
}
