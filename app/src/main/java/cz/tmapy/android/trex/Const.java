package cz.tmapy.android.trex;

/**
 * Created by kasvo on 4.8.2015.
 */
public final class Const {

    //http://stackoverflow.com/questions/2018263/how-do-i-enable-disable-log-levels-in-android
    private static int LOGLEVEL = 2;
    public static boolean LOG_BASIC = LOGLEVEL >= 1;
    public static boolean LOG_ENHANCED = LOGLEVEL >= 2;

    public static final String CHECK_FOR_NEW_VER_URL = "http://distrib.tmapy.cz/pub/distrib/t-rex/version.json";
    public static final String UPDATE_SITE_URL = "http://distrib.tmapy.cz/pub/distrib/t-rex/";
    public static final String HELP_SITE_URL = "https://github.com/T-MAPY/T-Rex/wiki";

    //Preferences keys
    public static final String PREF_KEY_DEVICE_ID = "pref_id";
    public static final String PREF_KEY_TARGET_SERVUER_URL = "pref_targetUrl";
    public static final String PREF_KEY_KEEP_SCREEN_ON = "pref_screen_on";
    public static final String PREF_LOC_STRATEGY = "pref_loc_strategy";
    public static final String PREF_LOC_FREQUENCY = "pref_loc_frequency";
    public static final String PREF_MIN_DIST = "pref_min_dist";
    public static final String PREF_SEND_INTERVAL = "pref_send_interval";
    public static final String PREF_KALMAN_MPS = "pref_kalman_mps";

    public static final String PREF_LAST_LOCATION_TIME = "pref_last_time";
    public static final String PREF_LAST_LOCATION_LAT = "pref last_lat";
    public static final String PREF_LAST_LOCATION_LON = "pref_last_lon";
    public static final String PREF_LAST_LOCATION_ALT = "pref_last_alt";
    public static final String PREF_LAST_LOCATION_SPEED = "pref_last_speed";
    public static final String PREF_LAST_LOCATION_BEARING = "pref_last_bearing";
    public static final String PREF_LAST_SERVER_RESPONSE = "pref_last_server_resp";

    //STATE constants
    //public static final String STATE_LOCALIZATION_IS_RUNNING = "biz.svoboda.trex.localizationIsRunning";
    public static final String STATE_LAST_LOCATION_TIME = "biz.svoboda.trex.lastLocationTime";
    public static final String STATE_LAST_LOCATION_LAT = "biz.svoboda.trex.lastLocationLast";
    public static final String STATE_LAST_LOCATION_LON = "biz.svoboda.trex.lastLocationLon";
    public static final String STATE_LAST_LOCATION_ALT = "biz.svoboda.trex.lastLocationAlt";
    public static final String STATE_LAST_LOCATION_SPEED = "biz.svoboda.trex.lastLocationSpeed";
    public static final String STATE_LAST_LOCATION_BEARING = "biz.svoboda.trex.lastLocationBearing";
    public static final String STATE_LAST_SERVER_RESPONSE = "biz.svoboda.trex.lastServerResponse";
    // for position broadcasting
    public static final String LOCATION_BROADCAST = "biz.svoboda.trex.LOCATION_BROADCAST";
    public static final String EXTRAS_POSITION_DATA = "biz.svoboda.trex.EXTRAS_POSITION_DATA";
    public static final String EXTRAS_SERVER_RESPONSE = "biz.svoboda.trex.EXTRAS_SERVER_RESPONSE";

}