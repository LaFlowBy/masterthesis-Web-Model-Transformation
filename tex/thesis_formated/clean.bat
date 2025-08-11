@echo off
echo ===============================================
echo Cleaning LaTeX auxiliary files...
echo ===============================================

del /Q *.aux *.log *.out *.toc *.lof *.lot *.bbl *.bcf *.blg *.run.xml *.fdb_latexmk *.fls *.synctex.gz *.alg *.acn *.glo *.ist *.acr *.glg *.gls 2>nul

echo Auxiliary files cleaned!
echo ===============================================

pause
