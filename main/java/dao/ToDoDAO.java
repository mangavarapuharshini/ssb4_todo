package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Register;
import beans.Task;
import factory.DBConn;

public interface ToDoDAO {
  public int register(Register register);

  public int login(String email, String pass);

  public List<Task> findTasksByRegId(int regId);

  public int addTask(Task task, int regId);

  public boolean markTaskCompleted(int taskId, int regId);

  public String getFLNameByRegID(int regId);
}