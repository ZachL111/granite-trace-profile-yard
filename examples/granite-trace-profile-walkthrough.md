# Granite Trace Profile Yard Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 199 | ship |
| stress | latency skew | 209 | ship |
| edge | signal loss | 222 | ship |
| recovery | incident shape | 129 | watch |
| stale | span volume | 161 | ship |

Start with `edge` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `recovery` becomes less cautious without a clear reason, I would inspect the drag input first.
