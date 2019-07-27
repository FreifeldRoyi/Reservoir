#!/usr/bin/env python3

import subprocess

tag = "reservoir/cqrswriter"
subprocess.run(["docker", "build", "-t", tag, "."])
