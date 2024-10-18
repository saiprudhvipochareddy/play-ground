package com.completable.Future.controller;

import java.util.concurrent.CompletableFuture;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AppUsersController {
//  @PostMapping(value = "/users", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = "application/json")
//  public CompletableFuture<ResponseEntity> saveUsers(@RequestBody ) throws Exception {
//    return ResponseEntity.status(HttpStatus.CREATED).build();
//  }
//
//  @GetMapping(value = "/users", produces = "application/json")
//  public CompletableFuture<ResponseEntity> findAllUsers() {
//    return  service.findAllUsers().thenApply(ResponseEntity::ok);
//  }
}
