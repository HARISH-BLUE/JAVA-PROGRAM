param(
    [string]$MainClass = "App"
)

if (-not (Test-Path "$PSScriptRoot/../bin")) {
    Write-Error "bin folder not found. Run scripts/build.ps1 first."
    exit 1
}

Write-Output "Running $MainClass..."
java -cp "$PSScriptRoot/../bin" $MainClass
