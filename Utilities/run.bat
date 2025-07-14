@echo off
REM turns off print code

REM variables init
set PARAM1=%~1
set BIN_APP_PATH="bin\%PARAM1%"

REM moves to the "bin\%PARAM1%" folder starting from the bat path
cd "%BIN_APP_PATH%"

REM runs main java file in the "bin/%PARAM1%/" folder given from
REM the first parameter of the command
java %PARAM1%

REM pause