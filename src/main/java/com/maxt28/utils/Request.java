package com.maxt28.utils;

public class Request {
    private final String method;
    private final String uri;

    public Request(String method, String uri) {
        this.method = method;
        this.uri = uri;
    }

    public static Request of(String method, String uri) {
        return new Request(method, uri);
    }

    @Override
    public int hashCode() {
        return (method.hashCode() + uri.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        Request req = (Request) o;
        return (method.equals(req.method) && uri.equals(req.uri));
    }
}
