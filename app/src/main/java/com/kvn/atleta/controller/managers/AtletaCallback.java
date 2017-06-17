package com.kvn.atleta.controller.managers;

import com.kvn.atleta.model.Atleta;

import java.util.List;


public interface AtletaCallback {
    void onSuccess(List<Atleta> playerList);
    void onSucces();

    void onFailure(Throwable t);
}
