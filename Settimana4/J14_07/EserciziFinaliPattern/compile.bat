@echo off
REM turns off print code

REM variables init
set BAT_PATH=%~dp0
set PARAM1=%~1

REM compiles main java file given from the first parameter
REM of the command
javac "%PARAM1%.java"

REM if compilation succeded
IF %ERRORLEVEL% EQU 0 (
	echo "No errors occurred"

	REM removes the bin folder if already
	REM exists
	IF EXIST "%BAT_PATH%/bin" (
		RMDIR /s /q "%BAT_PATH%/bin"
	)
	
	REM creates a bin folder inside the bat directory
	REM creates a folder based on the given cmd parameter inside the bin folder
	MD "%BAT_PATH%/bin"
	MD "%BAT_PATH%/bin/%PARAM1%"
    
	REM moves all .class files inside the %PARAM1% folder
	MOVE "%BAT_PATH%/*.class" "%BAT_PATH%/bin/%PARAM1%"
)

REM pause