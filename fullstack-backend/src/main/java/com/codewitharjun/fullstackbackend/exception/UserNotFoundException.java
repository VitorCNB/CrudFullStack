package com.codewitharjun.fullstackbackend.exception;
/* Created by Arjun Gautam */

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Usuário não encontrado "+ id);
    }
}
