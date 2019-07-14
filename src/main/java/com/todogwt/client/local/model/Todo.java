package com.todogwt.client.local.model;

public class Todo {

    private Integer index;
    private String todo;
    private Boolean isDone;

    public Todo(String todo, Boolean isDone) {
        setTodo(todo);
        setDone(isDone);
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

}
