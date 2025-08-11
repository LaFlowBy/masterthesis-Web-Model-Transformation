@echo off
echo ===============================================
echo Quick LaTeX Build (no biber/glossaries)
echo ===============================================
echo.

set MAIN_FILE=main

echo Running pdflatex compilation...
pdflatex -interaction=nonstopmode %MAIN_FILE%.tex
if %errorlevel% neq 0 (
    echo ERROR: pdflatex compilation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo ===============================================
echo QUICK BUILD COMPLETED!
echo Generated: %MAIN_FILE%.pdf
echo ===============================================

echo Opening PDF...
start %MAIN_FILE%.pdf

pause
