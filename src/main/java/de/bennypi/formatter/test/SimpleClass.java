package de.bennypi.formatter.test;


public class SimpleClass
{

  /**
   * The following empty line does not contain a trailing whitespace
   *
   * @param parameter
   * @return
   */
  public String methodWithoutTrailingWhitespace(String parameter)
  {
    return parameter;
  }

  /**
   * The following empty line does contain a trailing whitespace
   * 
   * @param parameter
   * @return
   */
  public String methodWithTrailingWhitespace(String parameter)
  {
    return parameter;
  }

}
