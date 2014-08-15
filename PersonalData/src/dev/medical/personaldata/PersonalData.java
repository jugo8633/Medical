package dev.medical.personaldata;

import interactive.common.ViewHandler;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PersonalData
{
	private OnFinishedListener	onFinishedListener	= null;
	private Button				btnFinish			= null;

	public static interface OnFinishedListener
	{
		public void onFinished();
	}

	public PersonalData(Activity activity)
	{
		super();
		int nResId = 0;
		nResId = ViewHandler.getResourceId(activity, "buttonFinish", "id");
		btnFinish = (Button) activity.findViewById(nResId);
		btnFinish.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if (null != onFinishedListener)
				{
					onFinishedListener.onFinished();
				}
			}
		});

	}

	public void setOnFinishedListener(OnFinishedListener listener)
	{
		onFinishedListener = listener;
	}
}
