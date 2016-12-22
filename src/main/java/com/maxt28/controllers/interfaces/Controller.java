package com.maxt28.controllers.interfaces;

import javax.servlet.http.HttpServletRequest;

public interface Controller {

    String process(HttpServletRequest req);
}
