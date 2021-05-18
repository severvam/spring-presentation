package com.example.demo;

import static java.lang.String.format;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HandlerService {

    private Map<String, MyHandler> handlers = new HashMap<>();

    public void register(String code, MyHandler handler) {
        if (!handlers.containsKey(code)) {
            handlers.put(code, handler);
        } else {
            throw new DuplicateHandlerException(format("Found two handlers with code %s", code));
        }
    }

    public void execute(String code) {
        var handler = handlers.get(code);
        handler.handle();
    }

}
