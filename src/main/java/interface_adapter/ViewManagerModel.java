package interface_adapter;

/**
 * Model for the View Manager. Its state is the name of the View which
 * is currently active. An initial state of "" is used.
 */
public class ViewManagerModel extends ViewModel<String> {

    public ViewManagerModel() {
        super("view manager");
        this.setState("");
    }

    /**
     * Changes the current view to the specified view.
     *
     * @param loggedIn The name of the view to change to.
     */

    public void changeView(String loggedIn) {
        this.setState(loggedIn);
        firePropertyChanged("currentView");
    }
}
