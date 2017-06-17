package com.kvn.atleta.controller.managers;

import com.kvn.atleta.model.UserToken;

public interface LoginCallback {
    void onSuccess(UserToken userToken);
    void onFailure(Throwable t);
}
