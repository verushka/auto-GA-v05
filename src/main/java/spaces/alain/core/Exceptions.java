package spaces.alain.core;

public enum Exceptions {
    ITEM_NOT_FOUND("[ItemNotFoundException]: Item with name: {} doesn't exist in Incidents list."),
    NULL_ELEMENT("[NullException]: Requested object is null."),
    NOT_NULL_ELEMENT("[NotNullException]: Requested object is not null."),
    NOT_EQUALS("[NotEqualsException]: Values are not equals.");

    private String exception;

    public String getException() {
        return exception;
    }

    public String getException(String value) {
        return exception.replace("{}", value);
    }

    private Exceptions(String exception) {
        this.exception = exception;
    }

}
