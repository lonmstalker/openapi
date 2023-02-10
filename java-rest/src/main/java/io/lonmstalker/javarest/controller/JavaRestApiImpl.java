package io.lonmstalker.javarest.controller;

import io.lonmstalker.openapi.api.JavaRestApi;
import io.lonmstalker.openapi.model.FirstObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class JavaRestApiImpl  implements JavaRestApi {

    @Override
    public ResponseEntity<FirstObject> findById(UUID id) {
        return null;
    }
}
