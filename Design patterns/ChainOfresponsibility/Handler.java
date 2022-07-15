package ChainOfresponsibility;

public abstract class Handler {

    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    abstract void CheckValidate(CheckSuccoer checkSuccoer);
}
