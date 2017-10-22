package com.lingusocial.nuance;

import android.net.Uri;

public class Credentials {

	public static final String APP_KEY = "330c340ba821c8166f06355deac23f59d4df067c7f7756247777994c516ea0847ad48f23f65739655d6ec2483101a105e0a7815f1ed783954e1ce19f8b822305";

	public static final String APP_ID = "NMDPPRODUCTION_appcore_bookeepr_20170621084432";

	public static final String SERVER_HOST = "ldf.nmdp.nuancemobility.net";

	public static final String SERVER_PORT = "443";

	public static final Uri SERVER_URI = Uri.parse("nmsps://" + APP_ID + "@" + SERVER_HOST + ":" + SERVER_PORT);
}
