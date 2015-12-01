package com.beyole.intelligentcampus.functions.life.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.beyole.bean.AllCourseCategory;
import com.beyole.intelligentcampus.R;

/**
 * @date 2015/10/19
 * @version 1.0
 * @author Iceberg
 * 
 */
public class AllCourseCategoryGridViewAdapter extends BaseAdapter {

	private List<AllCourseCategory> allCourseCategories;
	private LayoutInflater inflater;

	public AllCourseCategoryGridViewAdapter(Context context, List<AllCourseCategory> data) {
		allCourseCategories = data;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return allCourseCategories.size();
	}

	@Override
	public Object getItem(int position) {
		return allCourseCategories.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = inflater.inflate(R.layout.function_delicate_course_category_item_layout, null);
			viewHolder.categoryName = (TextView) convertView.findViewById(R.id.id_function_delicate_category_items_tv);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.categoryName.setText(allCourseCategories.get(position).getCategoryName());
		return convertView;
	}

	class ViewHolder {
		public TextView categoryName;
	}
}
