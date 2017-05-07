/**
 *  @title       ProcessB.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      20-Sep-2004
 *
 **/

package javamentor.samples.thread;

/**
 * 
 * @author martin.spamer
 * @version 0.1 - 09:18:51
 **/
public class ProcessB extends AbstractApplicationProcess
  {
    /**
     *
     * @param args
     */    
  public static void main(String[] args)
    {
      ProcessB processB = new ProcessB() ;
      processB.start() ;
    }
  }
