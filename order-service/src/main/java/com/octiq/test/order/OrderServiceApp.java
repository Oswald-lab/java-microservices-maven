package com.octiq.test.order;

import com.octiq.test.shared.Json;
import com.octiq.test.shared.MiniServer;
import java.io.IOException;
import java.util.List;

public class OrderServiceApp {
    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8082"));
        MiniServer.start(port, "/orders", () -> Json.array(List.of("order-1001", "order-1002")));
    }
}
