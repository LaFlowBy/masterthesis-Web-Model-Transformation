@echo off
echo ===============================================
echo LaTeX Build Script for Thesis
echo ===============================================
echo.

set MAIN_FILE=main

echo [1/5] Running initial pdflatex compilation...
pdflatex -interaction=nonstopmode %MAIN_FILE%.tex
if %errorlevel% neq 0 (
    echo ERROR: Initial pdflatex compilation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo [2/5] Processing bibliography with biber...
biber %MAIN_FILE%
if %errorlevel% neq 0 (
    echo ERROR: Biber processing failed!
    pause
    exit /b %errorlevel%
)

echo.
echo [3/5] Processing glossaries and acronyms...
makeglossaries %MAIN_FILE%
if %errorlevel% neq 0 (
    echo ERROR: Makeglossaries processing failed!
    pause
    exit /b %errorlevel%
)

echo.
echo [4/5] Running second pdflatex compilation...
pdflatex -interaction=nonstopmode %MAIN_FILE%.tex
if %errorlevel% neq 0 (
    echo ERROR: Second pdflatex compilation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo [5/5] Running final pdflatex compilation...
pdflatex -interaction=nonstopmode %MAIN_FILE%.tex
if %errorlevel% neq 0 (
    echo ERROR: Final pdflatex compilation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo ===============================================
echo BUILD COMPLETED SUCCESSFULLY!
echo Generated: %MAIN_FILE%.pdf
echo ===============================================

echo.
echo Cleaning up auxiliary files...
del /Q *.aux *.log *.out *.toc *.lof *.lot *.bbl *.bcf *.blg *.run.xml *.fdb_latexmk *.fls *.synctex.gz *.alg *.acn *.glo *.ist 2>nul

echo Build complete! Opening PDF...
start %MAIN_FILE%.pdf

pause
