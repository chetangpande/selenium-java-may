$windowHandel=WinGetHandle("Open");
WinActivate($windowHandel);

ControlSetText("File Upload","","[CLASS:Edit;INSTANCE:1]","H:\AutoIT\sample1_02_07_2017.txt")

ControlClick ( "File Upload", "", "[CLASS:Button;INSTANCE:1]")