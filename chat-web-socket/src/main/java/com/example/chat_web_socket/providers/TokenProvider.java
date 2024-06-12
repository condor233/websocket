package com.example.chat_web_socket.providers;

import java.util.Map;

public interface TokenProvider {
    Map<String, String> decode(String token);
}
