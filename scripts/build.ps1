mkdir -Force "$PSScriptRoot/../bin"

# Find all .java files under src/main/java only
$files = Get-ChildItem -Path "$PSScriptRoot/../src/main/java" -Recurse -Filter "*.java" -ErrorAction SilentlyContinue
if ($files.Count -eq 0) {
    Write-Output "No .java files found to compile."
    exit 0
}

Write-Output "Compiling $($files.Count) files..."

# Compile: pass the full paths array to javac
$paths = $files | ForEach-Object { $_.FullName }
javac -d "$PSScriptRoot/../bin" $paths

if ($LASTEXITCODE -ne 0) { Write-Error "Compilation failed"; exit $LASTEXITCODE }
Write-Output "Compilation succeeded. Classes are in ../bin"
