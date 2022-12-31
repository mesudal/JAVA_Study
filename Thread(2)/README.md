# 쓰레드 종료방법

<h3>Thread 종료 방법</h3>
<ul>
  <li>필드에 boolean 타입의 변수를 선언하고, run() 안에 있는 반복문에 해당 변수가 true일 경우 break 하도록 설계한다.</li>
  <li>sleep() 또는 wait(), join() 등의 메소드를 통해 쓰레드 일시정지 상태일 경우 Thread객체.interrrupt()를 새용하여 InterruptedException을 발생시킨다. 이때, 일시정지 시킨 메소드 부분의 catch를 통해 예외를 잡아주고 원하는 문장을 작성하면 된다.</li>
  <li>쓰레드를 일시정지하는 코드가 없을 경우 Thread.interrupted()의 상태를 확인한다. Thread객체.interrupt() 사용시 Thread.interrupted()의 상태는 true로 변경된다.</li>
  <li>System.exit()를 사용하면 전체 쓰레드 종료(프로세스 종료)</li>
</ul>
