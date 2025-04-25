'use client';// error boundaries must be client components

export default function GlobalError(
    {error}: { error: Error & { digest?: string } }
) {
  return (
      <html>
      <body>
      <h2>Global Error</h2>
      <p>{error}</p>
      </body>
      </html>
  )
}