package dev.medical.personaldata;

import interactive.common.ViewHandler;
import android.content.Context;

public class PersonalData
{
	private Context				theContext			= null;
	private OnFinishedListener	onFinishedListener	= null;

	public static interface OnFinishedListener
	{
		public void onFinished();
	}

	public PersonalData(Context context)
	{
		super();
		theContext = context;
		ViewHandler.getResourceId(context, "buttonFinish", "id");
	}

	public void setOnFinishedListener(OnFinishedListener listener)
	{
		onFinishedListener = listener;
	}
}
