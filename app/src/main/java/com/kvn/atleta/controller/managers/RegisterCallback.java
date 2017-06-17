package com.kvn.atleta.controller.managers;


public interface RegisterCallback {
    void onSuccess();
    void onFailure(Throwable t);
}
