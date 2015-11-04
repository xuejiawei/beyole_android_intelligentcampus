package com.beyole.intelligentcampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.Toast;

import com.beyole.intelligentcampus.settings.AboutUsActivity;
import com.beyole.intelligentcampus.settings.QRActivity;
import com.beyole.notifydialog.widget.effectdialog.Effectstype;
import com.beyole.notifydialog.widget.effectdialog.NiftyDialogBuilder;

/**
 * 设置 fragment
 * 
 * @author Iceberg
 * 
 */
public class SettingFragment extends Fragment {
	private Effectstype effect;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tab04, container, false);
		MyRowOnclickListener listener = new MyRowOnclickListener();
		TableRow row = (TableRow) view.findViewById(R.id.more_page_row0);
		TableRow row8 = (TableRow) view.findViewById(R.id.more_page_row8);
		row.setOnClickListener(listener);
		row8.setOnClickListener(listener);
		return view;
	}

	class MyRowOnclickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = null;
			switch (v.getId()) {
			case R.id.more_page_row0:
				intent = new Intent(getActivity(), QRActivity.class);
				startActivity(intent);
				activitySwitchAnimation();
				break;
			case R.id.more_page_row8:
				intent = new Intent(getActivity(), AboutUsActivity.class);
				startActivity(intent);
				activitySwitchAnimation();
				break;
			}
		}

		/**
		 * activity切换动画
		 */
		private void activitySwitchAnimation() {
			getActivity().overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		}

	}

	public void dialogShow() {
		final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(getActivity());
		effect = Effectstype.Slit;
		dialogBuilder.withTitle("提示框").withTitleColor("#FFFFFF").withDividerColor("#11000000").withMessage("点击了我的设置").withMessageColor("#FFFFFF").withIcon(getResources().getDrawable(R.drawable.ic_launcher)).isCancelableOnTouchOutside(true).withDuration(700).withEffect(effect).withButton1Text("确定")
				.withButton2Text("取消").setButton1Click(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(v.getContext(), "i'm btn1", Toast.LENGTH_SHORT).show();
						dialogBuilder.dismiss();
					}
				}).setButton2Click(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(v.getContext(), "i'm btn2", Toast.LENGTH_SHORT).show();
					}
				}).show();

	}

}
