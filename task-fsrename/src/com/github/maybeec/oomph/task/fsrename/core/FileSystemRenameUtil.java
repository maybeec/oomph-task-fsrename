/**
 *
 */
package com.github.maybeec.oomph.task.fsrename.core;

/**
 * @author sholzer
 *
 */
public interface FileSystemRenameUtil
{

  /**
   * renames the resource at source to destination using the native system commands
   * @param source File or Directory path
   * @param destination Name or path
   */
  void rename(String source, String destination);

}
