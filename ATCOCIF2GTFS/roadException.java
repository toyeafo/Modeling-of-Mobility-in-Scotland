/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATCOCIF2GTFS;

/**
 *
 * @author AFROGENIUS
 */
public class roadException extends RuntimeException {
    private static final long serialVersionUID = 1L;

  public roadException(String message) {
    super(message);
  }

  public roadException(String message, Exception ex) {
    super(message, ex);
  }
}