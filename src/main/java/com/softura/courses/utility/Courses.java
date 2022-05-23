package com.softura.courses.utility;

import java.util.List;
import java.util.Map;

abstract class Courses {

    public abstract List<Map<String,Object>> register(List<Map<String,Object>> courses);
    public abstract boolean deRegister(List<Map<String,Object>> courses);
    public abstract List<String> getCoursesOffered();
    public abstract List<String> getEmployeeRegisteredForCourse(String course,List<Map<String,Object>> list);





}
