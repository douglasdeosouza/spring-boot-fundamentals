package com.douglasdeosouza.fundamentals.service;


import com.douglasdeosouza.fundamentals.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


