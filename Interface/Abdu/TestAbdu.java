package Interface.Abdu;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import Interface.Penjelasan;

public class TestAbdu implements Penjelasan, Array{

  @Override
  public String getNama() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getNama'");
  }
  
  public static void main(String[] args) {
    Penjelasan penjelasan = new TestAbdu();
    penjelasan.getNama();
  }

  @Override
  public String getBaseTypeName() throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBaseTypeName'");
  }

  @Override
  public int getBaseType() throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBaseType'");
  }

  @Override
  public Object getArray() throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArray'");
  }

  @Override
  public Object getArray(Map<String, Class<?>> map) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArray'");
  }

  @Override
  public Object getArray(long index, int count) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArray'");
  }

  @Override
  public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArray'");
  }

  @Override
  public ResultSet getResultSet() throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResultSet'");
  }

  @Override
  public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResultSet'");
  }

  @Override
  public ResultSet getResultSet(long index, int count) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResultSet'");
  }

  @Override
  public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResultSet'");
  }

  @Override
  public void free() throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'free'");
  }

  @Override
  public int nextInt() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
  }

  @Override
  public boolean hasNext() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
  }
}
