

package fr.tr.cga.app.login;

public interface LoginInteractor {
    public void login(String username, String password, OnLoginFinishedListener listener);
}
