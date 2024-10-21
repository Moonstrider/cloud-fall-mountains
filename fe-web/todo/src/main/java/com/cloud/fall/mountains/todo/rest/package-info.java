// this will tell hilla that
// api in this package
// won't return null
@NonNullApi
package com.cloud.fall.mountains.todo.rest;

import org.springframework.lang.NonNullApi;

//useEffect(() => {
//        TodoEndpoint.findAll().then(setTodos);
//    }, []);
// this (setTodos) will complain about null
// in java everything can be null
// but in typescript we need to handle null
// so in the backend package add package-info.java
// add annotation to tell hilla that the endpoint won't return null