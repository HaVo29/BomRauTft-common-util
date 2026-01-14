package com.bomrautft.common_util.util.constant;

import com.bomrautft.common_util.util.exception.ConstructorException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String SUCCESS = "acknowledge";

    public static final String EMPTY = "";
    public static final String SPACE = " ";
    public static final String DOT = ".";
    public static final String COMMA = ",";
    public static final String HYPHEN = "-";
    public static final String UNDERSCORE = "_";
    public static final String SLASH = "/";
    public static final String CIRCUMFLEX = "^";
    public static final String SEMICOLON = ";";
    public static final String COLON = ":";
    public static final String JST = "JST";
    public static final String JSON_FILE = ".json";
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final String NOT_AVAILABLE = "N/A";
    public static final String STOPPED = "STOPPED";

    public static final String PAGE = "page";
    public static final String SIZE = "size";
    public static final String GROUP = "group";

    public static final String DEFAULT_PAGE = "1";
    public static final String DEFAULT_SIZE = "10";
    public static final String DEFAULT_SIZE_30 = "30";
    public static final String DEFAULT_GROUP = "1";

    public static final String WO_PAGE_SIZE_GANTT_CHART = "5";

    public static final String SERVICE_DATA_MASTER = "data-master";
    public static final String SERVICE_DATA_OPERATIONAL = "data-operational";
    public static final String SERVICE_DATA_WAREHOUSE = "data-warehouse";
    public static final String SERVICE_DATA_REPORT = "data-report";
    public static final String SERVICE_DATA_PLANNING = "data-planning";
    public static final String SERVICE_DATA_ASSET = "data-asset";

    public static final String STATUS_ACTIVE = "ACTIVE";
    public static final String STATUS_INACTIVE = "INACTIVE";

    /**
     * Unlimited page size
     */
    public static final int MAX_PAGE_SIZE = -1;

    public static final String BAD_REQUEST_DUPLICATED = "data-duplicate";
    public static final String BAD_REQUEST_DATA_IN_USE = "data-in-used";
    public static final String BAD_REQUEST_DATA_DELETED = "data-deleted";
    public static final String BAD_REQUEST_DATA_LIST_EMPTY = "data-list-empty";
    public static final String BAD_REQUEST_DATA_MISSED_FIELD = "data-missed-field";
    public static final String BAD_REQUEST_DATA_LENGTH_INVALID = "data-length-invalid";
    public static final String BAD_REQUEST_DATA_INVALID = "data-invalid";
    public static final String BAD_REQUEST_DATA_TYPE_INVALID = "data-type-invalid";
    public static final String BAD_REQUEST_ITEM_NOT_EXIST = "item-not-exist";
    public static final String BAD_REQUEST_DATA_ENUM_INVALID = "data-no-enum-constant";
    public static final String BAD_REQUEST_DATA_TRAINING_INVALID = "data-subscriber-training-not-exist";
    public static final String BAD_REQUEST_SERIAL_NUMBER_EXIST = "serial-number-exist";
    public static final String ACCESS_DENIED = "ACCESS-DENIED";
    public static final String CALENDAR_NOT_INIT = "calendar-not-exist";
    public static final String ROUTE_ITEM_NOT_EXIST = "route-item-not-exist";
    public static final String ITEM_NOT_MAPPING_WITH_LINE = "item-not-mapping-with-line";
    public static final String CALENDAR_NOT_ENOUGH = "calendar-not-enough-information";
    public static final String BUSINESS_EXCEPTION_MAPPING = "data-mapping-failed";
    public static final String SUPPLY_FOR_MATERIAL_REQUESTS = "MATERIAL REQUESTS";
    public static final String SEED_INTEGRATION_FAIL = "seed-integration-failed";
    public static final String SEED_INTEGRATION_SUCCESS = "seed-integration-success";
    public static final String LOAD_DATA_FAIL = "load-data-fail";
    public static final String CACHE_DATA_FAIL = "cache-data-fail";
    public static final String BAD_RECURSIVE = "bad-recursive";
    public static final String NULL_POINTER = "null-pointer-exception";
    public static final String PERMISSION_NOT_CHOOSED = "permission-not-choosed";
    public static final String SUMMARY_ERROR = "summary-error";

    public static final String SORT_DEFAULT = "ASC";
    public static final String SORT_ASC = "ASC";
    public static final String SORT_DESC = "DESC";


    /**
     * JWT
     */
    public static final String JWT_SECRET = "akames";
    public static final long JWT_EXPIRATION = 86400000l * 1;



    /**
     * necessary to generate password
     */
    public final static String PASSWORD_PATTERN = "\\d{8}|[a-zA-Z]{8}";

    /**
     * E-Form Constants
     */
    public static final String TABLE_NAME = "form-data";
    public static final String TABLE_COL_CREATED_BY = "createdBy";
    public static final String TABLE_COL_CREATED_AT = "createdAt";
    public static final String TABLE_COL_UPDATED_BY = "updateBy";
    public static final String TABLE_COL_UPDATED_AT = "updatedAt";
    public static final String TABLE_COL_ACTIVE = "active";
    public static final String TABLE_COL_FULL_NAME = "fullName";
    public static final String IS_SAMPLE = "isSample";
    public static final String SYSTEM = "System";
    public static final String TABLE_COL_PIN_AT = "pinAt";

    public static final String SORT_ID = "id";
    public static final String SORT_VERSION = "version";

    public final static HashMap<String, String> FORM = new HashMap<String, String>() {
        {
            put("id", "id");
            put("name", "name");
            put("description", "description");
            put("createdDate", "createdDateTime");
            put("updatedDate", "updatedDateTime");
            put("version", "defaultVersion");
        }
    };

    public final static HashMap<String, String> FORM_VERSION = new HashMap<String, String>() {
        {
            put("description", "description");
            put("updateBy", "updatedBy");
            put("updatedDate", "updatedDateTime");
            put("version", "version");
            put("fullName", "fullName");
        }
    };

    private Constants() {
        throw new ConstructorException();
    }

    /**
     * Permission user
     */
    public static final String USER_NOT_PERMISSION = "user-not-permission";

    //ACTIONS
    public static final String ACTION_VIEW = "VIEW";
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_DELETE = "DELETE";

    //MESSAGES
    public static final String MS298 = "MS298";

    //Notification
    public static final String PREFIX_TRAINING = "TRAINING";

    //Sort
    public static final String DESC_NULLS_LAST = "desc nulls last";

    //Data type
    public static final String DATA_TYPE_DATE = "Date";
    public static final String DATA_TYPE_BOOLEAN = "Boolean";
    public static final String DATA_TYPE_STRING = "String";
    public static final String DATA_TYPE_LONG = "Long";

    //User
    public static final String USER_NOT_EXIST_OR_INACTIVE = "USER_NOT_EXIST_OR_INACTIVE";

    public static final Date MIN_DATE = new Date(0L);

    public static final String DOLLAR = "$";
    public static final String OPEN_PARENTHESIS = "(";
    public static final String CLOSE_PARENTHESIS = ")";

    public static final String OPEN_BRACE = "{";
    public static final String CLOSE_BRACE = "}";

    public static final String OPEN_BRACKET = "[";
    public static final String CLOSE_BRACKET = "]";
    public static final String QUESTION_MARK = "?";
    public static final String BACK_SLASH  = "\\";
}
