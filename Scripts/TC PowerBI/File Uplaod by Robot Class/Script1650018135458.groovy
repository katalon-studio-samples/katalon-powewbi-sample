import java.awt.Robot as Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import java.util.concurrent.Delayed as Delayed

//Must Read
//Before runnig this script copy the file path path you want to uplaod.

//File file = new File('/Users/katalon/My_Development/git/Katalon_Demo_Project/MyTestFile/TestData.xlsx')
//StringSelection stringSelection = new StringSelection(file.getAbsolutePath())

StringSelection ss = new StringSelection("/Users/katalon/My_Development/git/Katalon_Demo_Project/MyTestFile/TestData.xlsx");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

//Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
Robot robot = new Robot()

// Cmd + Tab is needed since it launches a Java app and the browser looses focus
robot.keyPress(KeyEvent.VK_META)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_META)

robot.keyRelease(KeyEvent.VK_TAB)

robot.delay(5000)

//Open Goto window
robot.keyPress(KeyEvent.VK_META)

robot.keyPress(KeyEvent.VK_SHIFT)

robot.keyPress(KeyEvent.VK_G)

robot.keyRelease(KeyEvent.VK_META)

robot.keyRelease(KeyEvent.VK_SHIFT)

robot.keyRelease(KeyEvent.VK_G)

//Paste the clipboard value
robot.keyPress(KeyEvent.VK_META)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_META)

robot.keyRelease(KeyEvent.VK_V)

//Press Enter key to close the Goto window and Upload window
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.delay(5000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)