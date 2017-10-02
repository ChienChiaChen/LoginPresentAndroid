package com.prenetics.loginpresenterandroid.view;

public interface ILoginMvpView extends IBaseView {
    void showWaitingCursor();
    void hideWaitingCursor();
    void clearFocus();
}
