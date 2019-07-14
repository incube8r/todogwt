package com.todogwt.client.local.event;

public interface Callback<T> {
    void onFailure(Throwable throwable);
    void onSuccess(T response);
}
